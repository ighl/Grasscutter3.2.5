// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EchoShellInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EchoShellInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EchoShellInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EchoShellInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EchoShellInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013EchoShellInfo.proto\"!\n\rEchoShellInfo\u0012\u0010\n\bshell_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EchoShellInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EchoShellInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EchoShellInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EchoShellInfoOuterClass.internal_static_EchoShellInfo_descriptor, new String[] { "ShellId" });
    }
    
    public static final class EchoShellInfo extends GeneratedMessageV3 implements EchoShellInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SHELL_ID_FIELD_NUMBER = 1;
        private int shellId_;
        private byte memoizedIsInitialized;
        private static final EchoShellInfo DEFAULT_INSTANCE;
        private static final Parser<EchoShellInfo> PARSER;
        
        private EchoShellInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EchoShellInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EchoShellInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EchoShellInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.shellId_ = input.readUInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EchoShellInfoOuterClass.internal_static_EchoShellInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EchoShellInfoOuterClass.internal_static_EchoShellInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoShellInfo.class, Builder.class);
        }
        
        @Override
        public int getShellId() {
            return this.shellId_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.shellId_ != 0) {
                output.writeUInt32(1, this.shellId_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.shellId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.shellId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EchoShellInfo)) {
                return super.equals(obj);
            }
            final EchoShellInfo other = (EchoShellInfo)obj;
            return this.getShellId() == other.getShellId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getShellId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EchoShellInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data);
        }
        
        public static EchoShellInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EchoShellInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data);
        }
        
        public static EchoShellInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EchoShellInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data);
        }
        
        public static EchoShellInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EchoShellInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EchoShellInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EchoShellInfo.PARSER, input);
        }
        
        public static EchoShellInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EchoShellInfo.PARSER, input, extensionRegistry);
        }
        
        public static EchoShellInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EchoShellInfo.PARSER, input);
        }
        
        public static EchoShellInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EchoShellInfo.PARSER, input, extensionRegistry);
        }
        
        public static EchoShellInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EchoShellInfo.PARSER, input);
        }
        
        public static EchoShellInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EchoShellInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EchoShellInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EchoShellInfo prototype) {
            return EchoShellInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EchoShellInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EchoShellInfo getDefaultInstance() {
            return EchoShellInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EchoShellInfo> parser() {
            return EchoShellInfo.PARSER;
        }
        
        @Override
        public Parser<EchoShellInfo> getParserForType() {
            return EchoShellInfo.PARSER;
        }
        
        @Override
        public EchoShellInfo getDefaultInstanceForType() {
            return EchoShellInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EchoShellInfo();
            PARSER = new AbstractParser<EchoShellInfo>() {
                @Override
                public EchoShellInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EchoShellInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EchoShellInfoOrBuilder
        {
            private int shellId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EchoShellInfoOuterClass.internal_static_EchoShellInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EchoShellInfoOuterClass.internal_static_EchoShellInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoShellInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EchoShellInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.shellId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EchoShellInfoOuterClass.internal_static_EchoShellInfo_descriptor;
            }
            
            @Override
            public EchoShellInfo getDefaultInstanceForType() {
                return EchoShellInfo.getDefaultInstance();
            }
            
            @Override
            public EchoShellInfo build() {
                final EchoShellInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EchoShellInfo buildPartial() {
                final EchoShellInfo result = new EchoShellInfo(this);
                result.shellId_ = this.shellId_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof EchoShellInfo) {
                    return this.mergeFrom((EchoShellInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EchoShellInfo other) {
                if (other == EchoShellInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getShellId() != 0) {
                    this.setShellId(other.getShellId());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                EchoShellInfo parsedMessage = null;
                try {
                    parsedMessage = EchoShellInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EchoShellInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getShellId() {
                return this.shellId_;
            }
            
            public Builder setShellId(final int value) {
                this.shellId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShellId() {
                this.shellId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EchoShellInfoOrBuilder extends MessageOrBuilder
    {
        int getShellId();
    }
}

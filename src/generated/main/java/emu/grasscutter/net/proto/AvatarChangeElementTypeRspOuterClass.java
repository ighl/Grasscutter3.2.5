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

public final class AvatarChangeElementTypeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarChangeElementTypeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarChangeElementTypeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarChangeElementTypeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarChangeElementTypeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AvatarChangeElementTypeRsp.proto\"-\n\u001aAvatarChangeElementTypeRsp\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarChangeElementTypeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarChangeElementTypeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarChangeElementTypeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_descriptor, new String[] { "Retcode" });
    }
    
    public static final class AvatarChangeElementTypeRsp extends GeneratedMessageV3 implements AvatarChangeElementTypeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final AvatarChangeElementTypeRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarChangeElementTypeRsp> PARSER;
        
        private AvatarChangeElementTypeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarChangeElementTypeRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarChangeElementTypeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarChangeElementTypeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 104: {
                            this.retcode_ = input.readInt32();
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
            return AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarChangeElementTypeRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarChangeElementTypeRsp)) {
                return super.equals(obj);
            }
            final AvatarChangeElementTypeRsp other = (AvatarChangeElementTypeRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarChangeElementTypeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeRsp.PARSER, input);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarChangeElementTypeRsp.PARSER, input);
        }
        
        public static AvatarChangeElementTypeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarChangeElementTypeRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeRsp.PARSER, input);
        }
        
        public static AvatarChangeElementTypeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarChangeElementTypeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarChangeElementTypeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarChangeElementTypeRsp prototype) {
            return AvatarChangeElementTypeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarChangeElementTypeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarChangeElementTypeRsp getDefaultInstance() {
            return AvatarChangeElementTypeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarChangeElementTypeRsp> parser() {
            return AvatarChangeElementTypeRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarChangeElementTypeRsp> getParserForType() {
            return AvatarChangeElementTypeRsp.PARSER;
        }
        
        @Override
        public AvatarChangeElementTypeRsp getDefaultInstanceForType() {
            return AvatarChangeElementTypeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarChangeElementTypeRsp();
            PARSER = new AbstractParser<AvatarChangeElementTypeRsp>() {
                @Override
                public AvatarChangeElementTypeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarChangeElementTypeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarChangeElementTypeRspOrBuilder
        {
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarChangeElementTypeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarChangeElementTypeRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarChangeElementTypeRspOuterClass.internal_static_AvatarChangeElementTypeRsp_descriptor;
            }
            
            @Override
            public AvatarChangeElementTypeRsp getDefaultInstanceForType() {
                return AvatarChangeElementTypeRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarChangeElementTypeRsp build() {
                final AvatarChangeElementTypeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarChangeElementTypeRsp buildPartial() {
                final AvatarChangeElementTypeRsp result = new AvatarChangeElementTypeRsp(this);
                result.retcode_ = this.retcode_;
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
                if (other instanceof AvatarChangeElementTypeRsp) {
                    return this.mergeFrom((AvatarChangeElementTypeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarChangeElementTypeRsp other) {
                if (other == AvatarChangeElementTypeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                AvatarChangeElementTypeRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarChangeElementTypeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarChangeElementTypeRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface AvatarChangeElementTypeRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
    }
}

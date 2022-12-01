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

public final class SystemHintOuterClass
{
    private static final Descriptors.Descriptor internal_static_SystemHint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SystemHint_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SystemHintOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SystemHintOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010SystemHint.proto\"\u001a\n\nSystemHint\u0012\f\n\u0004type\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SystemHintOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SystemHint_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SystemHint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SystemHintOuterClass.internal_static_SystemHint_descriptor, new String[] { "Type" });
    }
    
    public static final class SystemHint extends GeneratedMessageV3 implements SystemHintOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        private byte memoizedIsInitialized;
        private static final SystemHint DEFAULT_INSTANCE;
        private static final Parser<SystemHint> PARSER;
        
        private SystemHint(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SystemHint() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SystemHint();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SystemHint(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.type_ = input.readUInt32();
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
            return SystemHintOuterClass.internal_static_SystemHint_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SystemHintOuterClass.internal_static_SystemHint_fieldAccessorTable.ensureFieldAccessorsInitialized(SystemHint.class, Builder.class);
        }
        
        @Override
        public int getType() {
            return this.type_;
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
            if (this.type_ != 0) {
                output.writeUInt32(1, this.type_);
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
            if (this.type_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.type_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SystemHint)) {
                return super.equals(obj);
            }
            final SystemHint other = (SystemHint)obj;
            return this.getType() == other.getType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SystemHint parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data);
        }
        
        public static SystemHint parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SystemHint parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data);
        }
        
        public static SystemHint parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SystemHint parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data);
        }
        
        public static SystemHint parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SystemHint.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SystemHint parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SystemHint.PARSER, input);
        }
        
        public static SystemHint parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SystemHint.PARSER, input, extensionRegistry);
        }
        
        public static SystemHint parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SystemHint.PARSER, input);
        }
        
        public static SystemHint parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SystemHint.PARSER, input, extensionRegistry);
        }
        
        public static SystemHint parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SystemHint.PARSER, input);
        }
        
        public static SystemHint parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SystemHint.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SystemHint.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SystemHint prototype) {
            return SystemHint.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SystemHint.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SystemHint getDefaultInstance() {
            return SystemHint.DEFAULT_INSTANCE;
        }
        
        public static Parser<SystemHint> parser() {
            return SystemHint.PARSER;
        }
        
        @Override
        public Parser<SystemHint> getParserForType() {
            return SystemHint.PARSER;
        }
        
        @Override
        public SystemHint getDefaultInstanceForType() {
            return SystemHint.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SystemHint();
            PARSER = new AbstractParser<SystemHint>() {
                @Override
                public SystemHint parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SystemHint(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SystemHintOrBuilder
        {
            private int type_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SystemHintOuterClass.internal_static_SystemHint_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SystemHintOuterClass.internal_static_SystemHint_fieldAccessorTable.ensureFieldAccessorsInitialized(SystemHint.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SystemHint.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SystemHintOuterClass.internal_static_SystemHint_descriptor;
            }
            
            @Override
            public SystemHint getDefaultInstanceForType() {
                return SystemHint.getDefaultInstance();
            }
            
            @Override
            public SystemHint build() {
                final SystemHint result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SystemHint buildPartial() {
                final SystemHint result = new SystemHint(this);
                result.type_ = this.type_;
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
                if (other instanceof SystemHint) {
                    return this.mergeFrom((SystemHint)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SystemHint other) {
                if (other == SystemHint.getDefaultInstance()) {
                    return this;
                }
                if (other.getType() != 0) {
                    this.setType(other.getType());
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
                SystemHint parsedMessage = null;
                try {
                    parsedMessage = SystemHint.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SystemHint)e.getUnfinishedMessage();
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
            public int getType() {
                return this.type_;
            }
            
            public Builder setType(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
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
    
    public interface SystemHintOrBuilder extends MessageOrBuilder
    {
        int getType();
    }
}

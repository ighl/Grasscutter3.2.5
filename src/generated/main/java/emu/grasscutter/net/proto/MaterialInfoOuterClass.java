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
import com.google.protobuf.Internal;
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

public final class MaterialInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MaterialInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MaterialInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MaterialInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012MaterialInfo.proto\"+\n\fMaterialInfo\u0012\r\n\u0005count\u0018\u000b \u0001(\r\u0012\f\n\u0004guid\u0018\u0005 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MaterialInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MaterialInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MaterialInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialInfoOuterClass.internal_static_MaterialInfo_descriptor, new String[] { "Count", "Guid" });
    }
    
    public static final class MaterialInfo extends GeneratedMessageV3 implements MaterialInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COUNT_FIELD_NUMBER = 11;
        private int count_;
        public static final int GUID_FIELD_NUMBER = 5;
        private long guid_;
        private byte memoizedIsInitialized;
        private static final MaterialInfo DEFAULT_INSTANCE;
        private static final Parser<MaterialInfo> PARSER;
        
        private MaterialInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MaterialInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MaterialInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MaterialInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.count_ = input.readUInt32();
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
            return MaterialInfoOuterClass.internal_static_MaterialInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MaterialInfoOuterClass.internal_static_MaterialInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialInfo.class, Builder.class);
        }
        
        @Override
        public int getCount() {
            return this.count_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
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
            if (this.guid_ != 0L) {
                output.writeUInt64(5, this.guid_);
            }
            if (this.count_ != 0) {
                output.writeUInt32(11, this.count_);
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
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.guid_);
            }
            if (this.count_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.count_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaterialInfo)) {
                return super.equals(obj);
            }
            final MaterialInfo other = (MaterialInfo)obj;
            return this.getCount() == other.getCount() && this.getGuid() == other.getGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCount();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MaterialInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialInfo.PARSER, input);
        }
        
        public static MaterialInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialInfo.PARSER, input, extensionRegistry);
        }
        
        public static MaterialInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MaterialInfo.PARSER, input);
        }
        
        public static MaterialInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MaterialInfo.PARSER, input, extensionRegistry);
        }
        
        public static MaterialInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialInfo.PARSER, input);
        }
        
        public static MaterialInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MaterialInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MaterialInfo prototype) {
            return MaterialInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MaterialInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MaterialInfo getDefaultInstance() {
            return MaterialInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MaterialInfo> parser() {
            return MaterialInfo.PARSER;
        }
        
        @Override
        public Parser<MaterialInfo> getParserForType() {
            return MaterialInfo.PARSER;
        }
        
        @Override
        public MaterialInfo getDefaultInstanceForType() {
            return MaterialInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MaterialInfo();
            PARSER = new AbstractParser<MaterialInfo>() {
                @Override
                public MaterialInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MaterialInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MaterialInfoOrBuilder
        {
            private int count_;
            private long guid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MaterialInfoOuterClass.internal_static_MaterialInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialInfoOuterClass.internal_static_MaterialInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MaterialInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.count_ = 0;
                this.guid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MaterialInfoOuterClass.internal_static_MaterialInfo_descriptor;
            }
            
            @Override
            public MaterialInfo getDefaultInstanceForType() {
                return MaterialInfo.getDefaultInstance();
            }
            
            @Override
            public MaterialInfo build() {
                final MaterialInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MaterialInfo buildPartial() {
                final MaterialInfo result = new MaterialInfo(this);
                result.count_ = this.count_;
                result.guid_ = this.guid_;
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
                if (other instanceof MaterialInfo) {
                    return this.mergeFrom((MaterialInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MaterialInfo other) {
                if (other == MaterialInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCount() != 0) {
                    this.setCount(other.getCount());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
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
                MaterialInfo parsedMessage = null;
                try {
                    parsedMessage = MaterialInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MaterialInfo)e.getUnfinishedMessage();
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
            public int getCount() {
                return this.count_;
            }
            
            public Builder setCount(final int value) {
                this.count_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCount() {
                this.count_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final long value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0L;
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
    
    public interface MaterialInfoOrBuilder extends MessageOrBuilder
    {
        int getCount();
        
        long getGuid();
    }
}

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

public final class WidgetCameraInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetCameraInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetCameraInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetCameraInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetCameraInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WidgetCameraInfo.proto\",\n\u0010WidgetCameraInfo\u0012\u0018\n\u0010target_entity_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetCameraInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetCameraInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetCameraInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_descriptor, new String[] { "TargetEntityId" });
    }
    
    public static final class WidgetCameraInfo extends GeneratedMessageV3 implements WidgetCameraInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 4;
        private int targetEntityId_;
        private byte memoizedIsInitialized;
        private static final WidgetCameraInfo DEFAULT_INSTANCE;
        private static final Parser<WidgetCameraInfo> PARSER;
        
        private WidgetCameraInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetCameraInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetCameraInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetCameraInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.targetEntityId_ = input.readUInt32();
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
            return WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCameraInfo.class, Builder.class);
        }
        
        @Override
        public int getTargetEntityId() {
            return this.targetEntityId_;
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
            if (this.targetEntityId_ != 0) {
                output.writeUInt32(4, this.targetEntityId_);
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
            if (this.targetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.targetEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetCameraInfo)) {
                return super.equals(obj);
            }
            final WidgetCameraInfo other = (WidgetCameraInfo)obj;
            return this.getTargetEntityId() == other.getTargetEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getTargetEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetCameraInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCameraInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCameraInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCameraInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCameraInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data);
        }
        
        public static WidgetCameraInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCameraInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCameraInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCameraInfo.PARSER, input);
        }
        
        public static WidgetCameraInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCameraInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCameraInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCameraInfo.PARSER, input);
        }
        
        public static WidgetCameraInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCameraInfo.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCameraInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCameraInfo.PARSER, input);
        }
        
        public static WidgetCameraInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCameraInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetCameraInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetCameraInfo prototype) {
            return WidgetCameraInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetCameraInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetCameraInfo getDefaultInstance() {
            return WidgetCameraInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetCameraInfo> parser() {
            return WidgetCameraInfo.PARSER;
        }
        
        @Override
        public Parser<WidgetCameraInfo> getParserForType() {
            return WidgetCameraInfo.PARSER;
        }
        
        @Override
        public WidgetCameraInfo getDefaultInstanceForType() {
            return WidgetCameraInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetCameraInfo();
            PARSER = new AbstractParser<WidgetCameraInfo>() {
                @Override
                public WidgetCameraInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetCameraInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetCameraInfoOrBuilder
        {
            private int targetEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCameraInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetCameraInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetEntityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetCameraInfoOuterClass.internal_static_WidgetCameraInfo_descriptor;
            }
            
            @Override
            public WidgetCameraInfo getDefaultInstanceForType() {
                return WidgetCameraInfo.getDefaultInstance();
            }
            
            @Override
            public WidgetCameraInfo build() {
                final WidgetCameraInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetCameraInfo buildPartial() {
                final WidgetCameraInfo result = new WidgetCameraInfo(this);
                result.targetEntityId_ = this.targetEntityId_;
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
                if (other instanceof WidgetCameraInfo) {
                    return this.mergeFrom((WidgetCameraInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetCameraInfo other) {
                if (other == WidgetCameraInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetEntityId() != 0) {
                    this.setTargetEntityId(other.getTargetEntityId());
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
                WidgetCameraInfo parsedMessage = null;
                try {
                    parsedMessage = WidgetCameraInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetCameraInfo)e.getUnfinishedMessage();
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
            public int getTargetEntityId() {
                return this.targetEntityId_;
            }
            
            public Builder setTargetEntityId(final int value) {
                this.targetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetEntityId() {
                this.targetEntityId_ = 0;
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
    
    public interface WidgetCameraInfoOrBuilder extends MessageOrBuilder
    {
        int getTargetEntityId();
    }
}

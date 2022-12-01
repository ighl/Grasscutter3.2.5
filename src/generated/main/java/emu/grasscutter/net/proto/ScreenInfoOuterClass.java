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

public final class ScreenInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ScreenInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ScreenInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ScreenInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ScreenInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010ScreenInfo.proto\":\n\nScreenInfo\u0012\u000f\n\u0007live_id\u0018\u0001 \u0001(\r\u0012\u001b\n\u0013projector_entity_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ScreenInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ScreenInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScreenInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor, new String[] { "LiveId", "ProjectorEntityId" });
    }
    
    public static final class ScreenInfo extends GeneratedMessageV3 implements ScreenInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LIVE_ID_FIELD_NUMBER = 1;
        private int liveId_;
        public static final int PROJECTOR_ENTITY_ID_FIELD_NUMBER = 2;
        private int projectorEntityId_;
        private byte memoizedIsInitialized;
        private static final ScreenInfo DEFAULT_INSTANCE;
        private static final Parser<ScreenInfo> PARSER;
        
        private ScreenInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ScreenInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ScreenInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ScreenInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.liveId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.projectorEntityId_ = input.readUInt32();
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
            return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ScreenInfo.class, Builder.class);
        }
        
        @Override
        public int getLiveId() {
            return this.liveId_;
        }
        
        @Override
        public int getProjectorEntityId() {
            return this.projectorEntityId_;
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
            if (this.liveId_ != 0) {
                output.writeUInt32(1, this.liveId_);
            }
            if (this.projectorEntityId_ != 0) {
                output.writeUInt32(2, this.projectorEntityId_);
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
            if (this.liveId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.liveId_);
            }
            if (this.projectorEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.projectorEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScreenInfo)) {
                return super.equals(obj);
            }
            final ScreenInfo other = (ScreenInfo)obj;
            return this.getLiveId() == other.getLiveId() && this.getProjectorEntityId() == other.getProjectorEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getLiveId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getProjectorEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ScreenInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data);
        }
        
        public static ScreenInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScreenInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data);
        }
        
        public static ScreenInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScreenInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data);
        }
        
        public static ScreenInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScreenInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScreenInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScreenInfo.PARSER, input);
        }
        
        public static ScreenInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScreenInfo.PARSER, input, extensionRegistry);
        }
        
        public static ScreenInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScreenInfo.PARSER, input);
        }
        
        public static ScreenInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScreenInfo.PARSER, input, extensionRegistry);
        }
        
        public static ScreenInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScreenInfo.PARSER, input);
        }
        
        public static ScreenInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScreenInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ScreenInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ScreenInfo prototype) {
            return ScreenInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ScreenInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ScreenInfo getDefaultInstance() {
            return ScreenInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ScreenInfo> parser() {
            return ScreenInfo.PARSER;
        }
        
        @Override
        public Parser<ScreenInfo> getParserForType() {
            return ScreenInfo.PARSER;
        }
        
        @Override
        public ScreenInfo getDefaultInstanceForType() {
            return ScreenInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ScreenInfo();
            PARSER = new AbstractParser<ScreenInfo>() {
                @Override
                public ScreenInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ScreenInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScreenInfoOrBuilder
        {
            private int liveId_;
            private int projectorEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ScreenInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ScreenInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.liveId_ = 0;
                this.projectorEntityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
            }
            
            @Override
            public ScreenInfo getDefaultInstanceForType() {
                return ScreenInfo.getDefaultInstance();
            }
            
            @Override
            public ScreenInfo build() {
                final ScreenInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ScreenInfo buildPartial() {
                final ScreenInfo result = new ScreenInfo(this);
                result.liveId_ = this.liveId_;
                result.projectorEntityId_ = this.projectorEntityId_;
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
                if (other instanceof ScreenInfo) {
                    return this.mergeFrom((ScreenInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ScreenInfo other) {
                if (other == ScreenInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getLiveId() != 0) {
                    this.setLiveId(other.getLiveId());
                }
                if (other.getProjectorEntityId() != 0) {
                    this.setProjectorEntityId(other.getProjectorEntityId());
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
                ScreenInfo parsedMessage = null;
                try {
                    parsedMessage = ScreenInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScreenInfo)e.getUnfinishedMessage();
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
            public int getLiveId() {
                return this.liveId_;
            }
            
            public Builder setLiveId(final int value) {
                this.liveId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLiveId() {
                this.liveId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getProjectorEntityId() {
                return this.projectorEntityId_;
            }
            
            public Builder setProjectorEntityId(final int value) {
                this.projectorEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProjectorEntityId() {
                this.projectorEntityId_ = 0;
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
    
    public interface ScreenInfoOrBuilder extends MessageOrBuilder
    {
        int getLiveId();
        
        int getProjectorEntityId();
    }
}

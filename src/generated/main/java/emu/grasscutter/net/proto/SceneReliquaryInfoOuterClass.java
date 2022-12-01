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

public final class SceneReliquaryInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneReliquaryInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneReliquaryInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneReliquaryInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneReliquaryInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018SceneReliquaryInfo.proto\"Y\n\u0012SceneReliquaryInfo\u0012\u000f\n\u0007item_id\u0018\u0001 \u0001(\r\u0012\f\n\u0004guid\u0018\u0002 \u0001(\u0004\u0012\r\n\u0005level\u0018\u0003 \u0001(\r\u0012\u0015\n\rpromote_level\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneReliquaryInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneReliquaryInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneReliquaryInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor, new String[] { "ItemId", "Guid", "Level", "PromoteLevel" });
    }
    
    public static final class SceneReliquaryInfo extends GeneratedMessageV3 implements SceneReliquaryInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_ID_FIELD_NUMBER = 1;
        private int itemId_;
        public static final int GUID_FIELD_NUMBER = 2;
        private long guid_;
        public static final int LEVEL_FIELD_NUMBER = 3;
        private int level_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 4;
        private int promoteLevel_;
        private byte memoizedIsInitialized;
        private static final SceneReliquaryInfo DEFAULT_INSTANCE;
        private static final Parser<SceneReliquaryInfo> PARSER;
        
        private SceneReliquaryInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneReliquaryInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneReliquaryInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneReliquaryInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 24: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.promoteLevel_ = input.readUInt32();
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
            return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneReliquaryInfo.class, Builder.class);
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
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
            if (this.itemId_ != 0) {
                output.writeUInt32(1, this.itemId_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(2, this.guid_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(3, this.level_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(4, this.promoteLevel_);
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
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.itemId_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.guid_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.level_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.promoteLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneReliquaryInfo)) {
                return super.equals(obj);
            }
            final SceneReliquaryInfo other = (SceneReliquaryInfo)obj;
            return this.getItemId() == other.getItemId() && this.getGuid() == other.getGuid() && this.getLevel() == other.getLevel() && this.getPromoteLevel() == other.getPromoteLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getPromoteLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneReliquaryInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data);
        }
        
        public static SceneReliquaryInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneReliquaryInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data);
        }
        
        public static SceneReliquaryInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneReliquaryInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data);
        }
        
        public static SceneReliquaryInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneReliquaryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneReliquaryInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneReliquaryInfo.PARSER, input);
        }
        
        public static SceneReliquaryInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneReliquaryInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneReliquaryInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneReliquaryInfo.PARSER, input);
        }
        
        public static SceneReliquaryInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneReliquaryInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneReliquaryInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneReliquaryInfo.PARSER, input);
        }
        
        public static SceneReliquaryInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneReliquaryInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneReliquaryInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneReliquaryInfo prototype) {
            return SceneReliquaryInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneReliquaryInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneReliquaryInfo getDefaultInstance() {
            return SceneReliquaryInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneReliquaryInfo> parser() {
            return SceneReliquaryInfo.PARSER;
        }
        
        @Override
        public Parser<SceneReliquaryInfo> getParserForType() {
            return SceneReliquaryInfo.PARSER;
        }
        
        @Override
        public SceneReliquaryInfo getDefaultInstanceForType() {
            return SceneReliquaryInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneReliquaryInfo();
            PARSER = new AbstractParser<SceneReliquaryInfo>() {
                @Override
                public SceneReliquaryInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneReliquaryInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneReliquaryInfoOrBuilder
        {
            private int itemId_;
            private long guid_;
            private int level_;
            private int promoteLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneReliquaryInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneReliquaryInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemId_ = 0;
                this.guid_ = 0L;
                this.level_ = 0;
                this.promoteLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
            }
            
            @Override
            public SceneReliquaryInfo getDefaultInstanceForType() {
                return SceneReliquaryInfo.getDefaultInstance();
            }
            
            @Override
            public SceneReliquaryInfo build() {
                final SceneReliquaryInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneReliquaryInfo buildPartial() {
                final SceneReliquaryInfo result = new SceneReliquaryInfo(this);
                result.itemId_ = this.itemId_;
                result.guid_ = this.guid_;
                result.level_ = this.level_;
                result.promoteLevel_ = this.promoteLevel_;
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
                if (other instanceof SceneReliquaryInfo) {
                    return this.mergeFrom((SceneReliquaryInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneReliquaryInfo other) {
                if (other == SceneReliquaryInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
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
                SceneReliquaryInfo parsedMessage = null;
                try {
                    parsedMessage = SceneReliquaryInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneReliquaryInfo)e.getUnfinishedMessage();
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
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
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
    
    public interface SceneReliquaryInfoOrBuilder extends MessageOrBuilder
    {
        int getItemId();
        
        long getGuid();
        
        int getLevel();
        
        int getPromoteLevel();
    }
}

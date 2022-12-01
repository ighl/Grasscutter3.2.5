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

public final class AvatarSkillChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarSkillChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarSkillChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarSkillChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarSkillChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAvatarSkillChangeNotify.proto\"\u0098\u0001\n\u0017AvatarSkillChangeNotify\u0012\u0011\n\tcur_level\u0018\u000b \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u0002 \u0001(\u0004\u0012\u0011\n\tentity_id\u0018\u0007 \u0001(\r\u0012\u0016\n\u000eskill_depot_id\u0018\r \u0001(\r\u0012\u0011\n\told_level\u0018\u0001 \u0001(\r\u0012\u0017\n\u000favatar_skill_id\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarSkillChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarSkillChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarSkillChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_descriptor, new String[] { "CurLevel", "AvatarGuid", "EntityId", "SkillDepotId", "OldLevel", "AvatarSkillId" });
    }
    
    public static final class AvatarSkillChangeNotify extends GeneratedMessageV3 implements AvatarSkillChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_LEVEL_FIELD_NUMBER = 11;
        private int curLevel_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 2;
        private long avatarGuid_;
        public static final int ENTITY_ID_FIELD_NUMBER = 7;
        private int entityId_;
        public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 13;
        private int skillDepotId_;
        public static final int OLD_LEVEL_FIELD_NUMBER = 1;
        private int oldLevel_;
        public static final int AVATAR_SKILL_ID_FIELD_NUMBER = 6;
        private int avatarSkillId_;
        private byte memoizedIsInitialized;
        private static final AvatarSkillChangeNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarSkillChangeNotify> PARSER;
        
        private AvatarSkillChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarSkillChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarSkillChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarSkillChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.oldLevel_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 48: {
                            this.avatarSkillId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.curLevel_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.skillDepotId_ = input.readUInt32();
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
            return AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getCurLevel() {
            return this.curLevel_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getSkillDepotId() {
            return this.skillDepotId_;
        }
        
        @Override
        public int getOldLevel() {
            return this.oldLevel_;
        }
        
        @Override
        public int getAvatarSkillId() {
            return this.avatarSkillId_;
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
            if (this.oldLevel_ != 0) {
                output.writeUInt32(1, this.oldLevel_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(2, this.avatarGuid_);
            }
            if (this.avatarSkillId_ != 0) {
                output.writeUInt32(6, this.avatarSkillId_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(7, this.entityId_);
            }
            if (this.curLevel_ != 0) {
                output.writeUInt32(11, this.curLevel_);
            }
            if (this.skillDepotId_ != 0) {
                output.writeUInt32(13, this.skillDepotId_);
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
            if (this.oldLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.oldLevel_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.avatarGuid_);
            }
            if (this.avatarSkillId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.avatarSkillId_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.entityId_);
            }
            if (this.curLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.curLevel_);
            }
            if (this.skillDepotId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.skillDepotId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarSkillChangeNotify)) {
                return super.equals(obj);
            }
            final AvatarSkillChangeNotify other = (AvatarSkillChangeNotify)obj;
            return this.getCurLevel() == other.getCurLevel() && this.getAvatarGuid() == other.getAvatarGuid() && this.getEntityId() == other.getEntityId() && this.getSkillDepotId() == other.getSkillDepotId() && this.getOldLevel() == other.getOldLevel() && this.getAvatarSkillId() == other.getAvatarSkillId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCurLevel();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getSkillDepotId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getOldLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getAvatarSkillId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarSkillChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillChangeNotify.PARSER, input);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillChangeNotify.PARSER, input);
        }
        
        public static AvatarSkillChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillChangeNotify.PARSER, input);
        }
        
        public static AvatarSkillChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarSkillChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarSkillChangeNotify prototype) {
            return AvatarSkillChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarSkillChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarSkillChangeNotify getDefaultInstance() {
            return AvatarSkillChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarSkillChangeNotify> parser() {
            return AvatarSkillChangeNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarSkillChangeNotify> getParserForType() {
            return AvatarSkillChangeNotify.PARSER;
        }
        
        @Override
        public AvatarSkillChangeNotify getDefaultInstanceForType() {
            return AvatarSkillChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarSkillChangeNotify();
            PARSER = new AbstractParser<AvatarSkillChangeNotify>() {
                @Override
                public AvatarSkillChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarSkillChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarSkillChangeNotifyOrBuilder
        {
            private int curLevel_;
            private long avatarGuid_;
            private int entityId_;
            private int skillDepotId_;
            private int oldLevel_;
            private int avatarSkillId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarSkillChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curLevel_ = 0;
                this.avatarGuid_ = 0L;
                this.entityId_ = 0;
                this.skillDepotId_ = 0;
                this.oldLevel_ = 0;
                this.avatarSkillId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarSkillChangeNotifyOuterClass.internal_static_AvatarSkillChangeNotify_descriptor;
            }
            
            @Override
            public AvatarSkillChangeNotify getDefaultInstanceForType() {
                return AvatarSkillChangeNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarSkillChangeNotify build() {
                final AvatarSkillChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarSkillChangeNotify buildPartial() {
                final AvatarSkillChangeNotify result = new AvatarSkillChangeNotify(this);
                result.curLevel_ = this.curLevel_;
                result.avatarGuid_ = this.avatarGuid_;
                result.entityId_ = this.entityId_;
                result.skillDepotId_ = this.skillDepotId_;
                result.oldLevel_ = this.oldLevel_;
                result.avatarSkillId_ = this.avatarSkillId_;
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
                if (other instanceof AvatarSkillChangeNotify) {
                    return this.mergeFrom((AvatarSkillChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarSkillChangeNotify other) {
                if (other == AvatarSkillChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurLevel() != 0) {
                    this.setCurLevel(other.getCurLevel());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getSkillDepotId() != 0) {
                    this.setSkillDepotId(other.getSkillDepotId());
                }
                if (other.getOldLevel() != 0) {
                    this.setOldLevel(other.getOldLevel());
                }
                if (other.getAvatarSkillId() != 0) {
                    this.setAvatarSkillId(other.getAvatarSkillId());
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
                AvatarSkillChangeNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarSkillChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarSkillChangeNotify)e.getUnfinishedMessage();
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
            public int getCurLevel() {
                return this.curLevel_;
            }
            
            public Builder setCurLevel(final int value) {
                this.curLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurLevel() {
                this.curLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSkillDepotId() {
                return this.skillDepotId_;
            }
            
            public Builder setSkillDepotId(final int value) {
                this.skillDepotId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkillDepotId() {
                this.skillDepotId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOldLevel() {
                return this.oldLevel_;
            }
            
            public Builder setOldLevel(final int value) {
                this.oldLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOldLevel() {
                this.oldLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAvatarSkillId() {
                return this.avatarSkillId_;
            }
            
            public Builder setAvatarSkillId(final int value) {
                this.avatarSkillId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarSkillId() {
                this.avatarSkillId_ = 0;
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
    
    public interface AvatarSkillChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getCurLevel();
        
        long getAvatarGuid();
        
        int getEntityId();
        
        int getSkillDepotId();
        
        int getOldLevel();
        
        int getAvatarSkillId();
    }
}

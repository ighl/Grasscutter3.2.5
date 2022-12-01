// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarLifeStateChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarLifeStateChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarLifeStateChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarLifeStateChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!AvatarLifeStateChangeNotify.proto\u001a\u0013PlayerDieType.proto\u001a\u0010ServerBuff.proto\"\u00d8\u0001\n\u001bAvatarLifeStateChangeNotify\u0012\u0012\n\nlife_state\u0018\r \u0001(\r\u0012\u0012\n\nattack_tag\u0018\n \u0001(\t\u0012 \n\bdie_type\u0018\u0002 \u0001(\u000e2\u000e.PlayerDieType\u0012%\n\u0010server_buff_list\u0018\f \u0003(\u000b2\u000b.ServerBuff\u0012\u0019\n\u0011move_reliable_seq\u0018\u0005 \u0001(\r\u0012\u0018\n\u0010source_entity_id\u0018\u0003 \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u000b \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarLifeStateChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerDieTypeOuterClass.getDescriptor(), ServerBuffOuterClass.getDescriptor() });
        internal_static_AvatarLifeStateChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_descriptor, new String[] { "LifeState", "AttackTag", "DieType", "ServerBuffList", "MoveReliableSeq", "SourceEntityId", "AvatarGuid" });
        PlayerDieTypeOuterClass.getDescriptor();
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class AvatarLifeStateChangeNotify extends GeneratedMessageV3 implements AvatarLifeStateChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LIFE_STATE_FIELD_NUMBER = 13;
        private int lifeState_;
        public static final int ATTACK_TAG_FIELD_NUMBER = 10;
        private volatile Object attackTag_;
        public static final int DIE_TYPE_FIELD_NUMBER = 2;
        private int dieType_;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 12;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        public static final int MOVE_RELIABLE_SEQ_FIELD_NUMBER = 5;
        private int moveReliableSeq_;
        public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 3;
        private int sourceEntityId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 11;
        private long avatarGuid_;
        private byte memoizedIsInitialized;
        private static final AvatarLifeStateChangeNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarLifeStateChangeNotify> PARSER;
        
        private AvatarLifeStateChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarLifeStateChangeNotify() {
            this.memoizedIsInitialized = -1;
            this.attackTag_ = "";
            this.dieType_ = 0;
            this.serverBuffList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarLifeStateChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarLifeStateChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.dieType_ = rawValue;
                            continue;
                        }
                        case 24: {
                            this.sourceEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.moveReliableSeq_ = input.readUInt32();
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.attackTag_ = s;
                            continue;
                        }
                        case 88: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
                            continue;
                        }
                        case 104: {
                            this.lifeState_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarLifeStateChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getLifeState() {
            return this.lifeState_;
        }
        
        @Override
        public String getAttackTag() {
            final Object ref = this.attackTag_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.attackTag_ = s);
        }
        
        @Override
        public ByteString getAttackTagBytes() {
            final Object ref = this.attackTag_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.attackTag_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getDieTypeValue() {
            return this.dieType_;
        }
        
        @Override
        public PlayerDieTypeOuterClass.PlayerDieType getDieType() {
            final PlayerDieTypeOuterClass.PlayerDieType result = PlayerDieTypeOuterClass.PlayerDieType.valueOf(this.dieType_);
            return (result == null) ? PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
        }
        
        @Override
        public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
            return this.serverBuffList_;
        }
        
        @Override
        public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
            return this.serverBuffList_;
        }
        
        @Override
        public int getServerBuffListCount() {
            return this.serverBuffList_.size();
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public int getMoveReliableSeq() {
            return this.moveReliableSeq_;
        }
        
        @Override
        public int getSourceEntityId() {
            return this.sourceEntityId_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
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
            if (this.dieType_ != PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
                output.writeEnum(2, this.dieType_);
            }
            if (this.sourceEntityId_ != 0) {
                output.writeUInt32(3, this.sourceEntityId_);
            }
            if (this.moveReliableSeq_ != 0) {
                output.writeUInt32(5, this.moveReliableSeq_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.attackTag_)) {
                GeneratedMessageV3.writeString(output, 10, this.attackTag_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(11, this.avatarGuid_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(12, this.serverBuffList_.get(i));
            }
            if (this.lifeState_ != 0) {
                output.writeUInt32(13, this.lifeState_);
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
            if (this.dieType_ != PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.dieType_);
            }
            if (this.sourceEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.sourceEntityId_);
            }
            if (this.moveReliableSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.moveReliableSeq_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.attackTag_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.attackTag_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(11, this.avatarGuid_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.serverBuffList_.get(i));
            }
            if (this.lifeState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.lifeState_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarLifeStateChangeNotify)) {
                return super.equals(obj);
            }
            final AvatarLifeStateChangeNotify other = (AvatarLifeStateChangeNotify)obj;
            return this.getLifeState() == other.getLifeState() && this.getAttackTag().equals(other.getAttackTag()) && this.dieType_ == other.dieType_ && this.getServerBuffListList().equals(other.getServerBuffListList()) && this.getMoveReliableSeq() == other.getMoveReliableSeq() && this.getSourceEntityId() == other.getSourceEntityId() && this.getAvatarGuid() == other.getAvatarGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getLifeState();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getAttackTag().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.dieType_;
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMoveReliableSeq();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSourceEntityId();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarLifeStateChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarLifeStateChangeNotify.PARSER, input);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarLifeStateChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarLifeStateChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarLifeStateChangeNotify.PARSER, input);
        }
        
        public static AvatarLifeStateChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarLifeStateChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarLifeStateChangeNotify.PARSER, input);
        }
        
        public static AvatarLifeStateChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarLifeStateChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarLifeStateChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarLifeStateChangeNotify prototype) {
            return AvatarLifeStateChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarLifeStateChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarLifeStateChangeNotify getDefaultInstance() {
            return AvatarLifeStateChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarLifeStateChangeNotify> parser() {
            return AvatarLifeStateChangeNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarLifeStateChangeNotify> getParserForType() {
            return AvatarLifeStateChangeNotify.PARSER;
        }
        
        @Override
        public AvatarLifeStateChangeNotify getDefaultInstanceForType() {
            return AvatarLifeStateChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarLifeStateChangeNotify();
            PARSER = new AbstractParser<AvatarLifeStateChangeNotify>() {
                @Override
                public AvatarLifeStateChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarLifeStateChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarLifeStateChangeNotifyOrBuilder
        {
            private int bitField0_;
            private int lifeState_;
            private Object attackTag_;
            private int dieType_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            private int moveReliableSeq_;
            private int sourceEntityId_;
            private long avatarGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarLifeStateChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.attackTag_ = "";
                this.dieType_ = 0;
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.attackTag_ = "";
                this.dieType_ = 0;
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarLifeStateChangeNotify.alwaysUseFieldBuilders) {
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.lifeState_ = 0;
                this.attackTag_ = "";
                this.dieType_ = 0;
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                this.moveReliableSeq_ = 0;
                this.sourceEntityId_ = 0;
                this.avatarGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarLifeStateChangeNotifyOuterClass.internal_static_AvatarLifeStateChangeNotify_descriptor;
            }
            
            @Override
            public AvatarLifeStateChangeNotify getDefaultInstanceForType() {
                return AvatarLifeStateChangeNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarLifeStateChangeNotify build() {
                final AvatarLifeStateChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarLifeStateChangeNotify buildPartial() {
                final AvatarLifeStateChangeNotify result = new AvatarLifeStateChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.lifeState_ = this.lifeState_;
                result.attackTag_ = this.attackTag_;
                result.dieType_ = this.dieType_;
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
                }
                result.moveReliableSeq_ = this.moveReliableSeq_;
                result.sourceEntityId_ = this.sourceEntityId_;
                result.avatarGuid_ = this.avatarGuid_;
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
                if (other instanceof AvatarLifeStateChangeNotify) {
                    return this.mergeFrom((AvatarLifeStateChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarLifeStateChangeNotify other) {
                if (other == AvatarLifeStateChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getLifeState() != 0) {
                    this.setLifeState(other.getLifeState());
                }
                if (!other.getAttackTag().isEmpty()) {
                    this.attackTag_ = other.attackTag_;
                    this.onChanged();
                }
                if (other.dieType_ != 0) {
                    this.setDieTypeValue(other.getDieTypeValue());
                }
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureServerBuffListIsMutable();
                            this.serverBuffList_.addAll(other.serverBuffList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.serverBuffList_.isEmpty()) {
                    if (this.serverBuffListBuilder_.isEmpty()) {
                        this.serverBuffListBuilder_.dispose();
                        this.serverBuffListBuilder_ = null;
                        this.serverBuffList_ = other.serverBuffList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.serverBuffListBuilder_ = (AvatarLifeStateChangeNotify.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
                }
                if (other.getMoveReliableSeq() != 0) {
                    this.setMoveReliableSeq(other.getMoveReliableSeq());
                }
                if (other.getSourceEntityId() != 0) {
                    this.setSourceEntityId(other.getSourceEntityId());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
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
                AvatarLifeStateChangeNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarLifeStateChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarLifeStateChangeNotify)e.getUnfinishedMessage();
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
            public int getLifeState() {
                return this.lifeState_;
            }
            
            public Builder setLifeState(final int value) {
                this.lifeState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLifeState() {
                this.lifeState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAttackTag() {
                final Object ref = this.attackTag_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.attackTag_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAttackTagBytes() {
                final Object ref = this.attackTag_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.attackTag_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAttackTag(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.attackTag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAttackTag() {
                this.attackTag_ = AvatarLifeStateChangeNotify.getDefaultInstance().getAttackTag();
                this.onChanged();
                return this;
            }
            
            public Builder setAttackTagBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.attackTag_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDieTypeValue() {
                return this.dieType_;
            }
            
            public Builder setDieTypeValue(final int value) {
                this.dieType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public PlayerDieTypeOuterClass.PlayerDieType getDieType() {
                final PlayerDieTypeOuterClass.PlayerDieType result = PlayerDieTypeOuterClass.PlayerDieType.valueOf(this.dieType_);
                return (result == null) ? PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
            }
            
            public Builder setDieType(final PlayerDieTypeOuterClass.PlayerDieType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dieType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearDieType() {
                this.dieType_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
                if (this.serverBuffListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                return this.serverBuffListBuilder_.getMessageList();
            }
            
            @Override
            public int getServerBuffListCount() {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.size();
                }
                return this.serverBuffListBuilder_.getCount();
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessage(index);
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllServerBuffList(final Iterable<? extends ServerBuffOuterClass.ServerBuff> values) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.serverBuffList_);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearServerBuffList() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.remove(index);
                }
                return this;
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder getServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
                if (this.serverBuffListBuilder_ != null) {
                    return this.serverBuffListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuffOrBuilder>)this.serverBuffList_);
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder() {
                return this.getServerBuffListFieldBuilder().addBuilder(ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().addBuilder(index, ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public List<ServerBuffOuterClass.ServerBuff.Builder> getServerBuffListBuilderList() {
                return this.getServerBuffListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListFieldBuilder() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
            }
            
            @Override
            public int getMoveReliableSeq() {
                return this.moveReliableSeq_;
            }
            
            public Builder setMoveReliableSeq(final int value) {
                this.moveReliableSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMoveReliableSeq() {
                this.moveReliableSeq_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSourceEntityId() {
                return this.sourceEntityId_;
            }
            
            public Builder setSourceEntityId(final int value) {
                this.sourceEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSourceEntityId() {
                this.sourceEntityId_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AvatarLifeStateChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getLifeState();
        
        String getAttackTag();
        
        ByteString getAttackTagBytes();
        
        int getDieTypeValue();
        
        PlayerDieTypeOuterClass.PlayerDieType getDieType();
        
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
        
        int getMoveReliableSeq();
        
        int getSourceEntityId();
        
        long getAvatarGuid();
    }
}

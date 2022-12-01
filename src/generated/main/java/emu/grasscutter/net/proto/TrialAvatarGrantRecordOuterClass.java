// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
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

public final class TrialAvatarGrantRecordOuterClass
{
    private static final Descriptors.Descriptor internal_static_TrialAvatarGrantRecord_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TrialAvatarGrantRecord_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TrialAvatarGrantRecordOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TrialAvatarGrantRecordOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cTrialAvatarGrantRecord.proto\"\u00c1\u0004\n\u0016TrialAvatarGrantRecord\u0012\u0014\n\fgrant_reason\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014from_parent_quest_id\u0018\u0002 \u0001(\r\"\u00f2\u0003\n\u000bGrantReason\u0012\u0018\n\u0014GRANT_REASON_INVALID\u0010\u0000\u0012\u0019\n\u0015GRANT_REASON_BY_QUEST\u0010\u0001\u0012)\n%GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY\u0010\u0002\u0012-\n)GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE\u0010\u0003\u0012'\n#GRANT_REASON_BY_MIST_TRIAL_ACTIVITY\u0010\u0004\u0012!\n\u001dGRANT_REASON_BY_SUMO_ACTIVITY\u0010\u0005\u0012$\n GRANT_REASON_Unk2700_ELPMDIEIOHP\u0010\u0006\u0012$\n GRANT_REASON_Unk2700_FALPDBLGHJB\u0010\u0007\u0012$\n GRANT_REASON_Unk2700_GAMADMGGMBC\u0010\b\u0012$\n GRANT_REASON_Unk2800_FIIDJHAKMOI\u0010\t\u0012$\n GRANT_REASON_Unk3000_ANPCNHCADHG\u0010\n\u0012$\n GRANT_REASON_Unk3000_AJIFFOLFKLO\u0010\u000b\u0012$\n GRANT_REASON_Unk3100_CKJJFGCFGEE\u0010\fB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TrialAvatarGrantRecordOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TrialAvatarGrantRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TrialAvatarGrantRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor, new String[] { "GrantReason", "FromParentQuestId" });
    }
    
    public static final class TrialAvatarGrantRecord extends GeneratedMessageV3 implements TrialAvatarGrantRecordOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GRANT_REASON_FIELD_NUMBER = 1;
        private int grantReason_;
        public static final int FROM_PARENT_QUEST_ID_FIELD_NUMBER = 2;
        private int fromParentQuestId_;
        private byte memoizedIsInitialized;
        private static final TrialAvatarGrantRecord DEFAULT_INSTANCE;
        private static final Parser<TrialAvatarGrantRecord> PARSER;
        
        private TrialAvatarGrantRecord(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TrialAvatarGrantRecord() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TrialAvatarGrantRecord();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TrialAvatarGrantRecord(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.grantReason_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.fromParentQuestId_ = input.readUInt32();
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
            return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TrialAvatarGrantRecord.class, Builder.class);
        }
        
        @Override
        public int getGrantReason() {
            return this.grantReason_;
        }
        
        @Override
        public int getFromParentQuestId() {
            return this.fromParentQuestId_;
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
            if (this.grantReason_ != 0) {
                output.writeUInt32(1, this.grantReason_);
            }
            if (this.fromParentQuestId_ != 0) {
                output.writeUInt32(2, this.fromParentQuestId_);
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
            if (this.grantReason_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.grantReason_);
            }
            if (this.fromParentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.fromParentQuestId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrialAvatarGrantRecord)) {
                return super.equals(obj);
            }
            final TrialAvatarGrantRecord other = (TrialAvatarGrantRecord)obj;
            return this.getGrantReason() == other.getGrantReason() && this.getFromParentQuestId() == other.getFromParentQuestId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getGrantReason();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFromParentQuestId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TrialAvatarGrantRecord parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarGrantRecord.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarGrantRecord.PARSER, input);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarGrantRecord.PARSER, input, extensionRegistry);
        }
        
        public static TrialAvatarGrantRecord parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrialAvatarGrantRecord.PARSER, input);
        }
        
        public static TrialAvatarGrantRecord parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrialAvatarGrantRecord.PARSER, input, extensionRegistry);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarGrantRecord.PARSER, input);
        }
        
        public static TrialAvatarGrantRecord parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarGrantRecord.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TrialAvatarGrantRecord.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TrialAvatarGrantRecord prototype) {
            return TrialAvatarGrantRecord.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TrialAvatarGrantRecord.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TrialAvatarGrantRecord getDefaultInstance() {
            return TrialAvatarGrantRecord.DEFAULT_INSTANCE;
        }
        
        public static Parser<TrialAvatarGrantRecord> parser() {
            return TrialAvatarGrantRecord.PARSER;
        }
        
        @Override
        public Parser<TrialAvatarGrantRecord> getParserForType() {
            return TrialAvatarGrantRecord.PARSER;
        }
        
        @Override
        public TrialAvatarGrantRecord getDefaultInstanceForType() {
            return TrialAvatarGrantRecord.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TrialAvatarGrantRecord();
            PARSER = new AbstractParser<TrialAvatarGrantRecord>() {
                @Override
                public TrialAvatarGrantRecord parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TrialAvatarGrantRecord(input, extensionRegistry);
                }
            };
        }
        
        public enum GrantReason implements ProtocolMessageEnum
        {
            GRANT_REASON_INVALID(0), 
            GRANT_REASON_BY_QUEST(1), 
            GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY(2), 
            GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE(3), 
            GRANT_REASON_BY_MIST_TRIAL_ACTIVITY(4), 
            GRANT_REASON_BY_SUMO_ACTIVITY(5), 
            GRANT_REASON_Unk2700_ELPMDIEIOHP(6), 
            GRANT_REASON_Unk2700_FALPDBLGHJB(7), 
            GRANT_REASON_Unk2700_GAMADMGGMBC(8), 
            GRANT_REASON_Unk2800_FIIDJHAKMOI(9), 
            GRANT_REASON_Unk3000_ANPCNHCADHG(10), 
            GRANT_REASON_Unk3000_AJIFFOLFKLO(11), 
            GRANT_REASON_Unk3100_CKJJFGCFGEE(12), 
            UNRECOGNIZED(-1);
            
            public static final int GRANT_REASON_INVALID_VALUE = 0;
            public static final int GRANT_REASON_BY_QUEST_VALUE = 1;
            public static final int GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY_VALUE = 2;
            public static final int GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE_VALUE = 3;
            public static final int GRANT_REASON_BY_MIST_TRIAL_ACTIVITY_VALUE = 4;
            public static final int GRANT_REASON_BY_SUMO_ACTIVITY_VALUE = 5;
            public static final int GRANT_REASON_Unk2700_ELPMDIEIOHP_VALUE = 6;
            public static final int GRANT_REASON_Unk2700_FALPDBLGHJB_VALUE = 7;
            public static final int GRANT_REASON_Unk2700_GAMADMGGMBC_VALUE = 8;
            public static final int GRANT_REASON_Unk2800_FIIDJHAKMOI_VALUE = 9;
            public static final int GRANT_REASON_Unk3000_ANPCNHCADHG_VALUE = 10;
            public static final int GRANT_REASON_Unk3000_AJIFFOLFKLO_VALUE = 11;
            public static final int GRANT_REASON_Unk3100_CKJJFGCFGEE_VALUE = 12;
            private static final Internal.EnumLiteMap<GrantReason> internalValueMap;
            private static final GrantReason[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == GrantReason.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static GrantReason valueOf(final int value) {
                return forNumber(value);
            }
            
            public static GrantReason forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return GrantReason.GRANT_REASON_INVALID;
                    }
                    case 1: {
                        return GrantReason.GRANT_REASON_BY_QUEST;
                    }
                    case 2: {
                        return GrantReason.GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY;
                    }
                    case 3: {
                        return GrantReason.GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE;
                    }
                    case 4: {
                        return GrantReason.GRANT_REASON_BY_MIST_TRIAL_ACTIVITY;
                    }
                    case 5: {
                        return GrantReason.GRANT_REASON_BY_SUMO_ACTIVITY;
                    }
                    case 6: {
                        return GrantReason.GRANT_REASON_Unk2700_ELPMDIEIOHP;
                    }
                    case 7: {
                        return GrantReason.GRANT_REASON_Unk2700_FALPDBLGHJB;
                    }
                    case 8: {
                        return GrantReason.GRANT_REASON_Unk2700_GAMADMGGMBC;
                    }
                    case 9: {
                        return GrantReason.GRANT_REASON_Unk2800_FIIDJHAKMOI;
                    }
                    case 10: {
                        return GrantReason.GRANT_REASON_Unk3000_ANPCNHCADHG;
                    }
                    case 11: {
                        return GrantReason.GRANT_REASON_Unk3000_AJIFFOLFKLO;
                    }
                    case 12: {
                        return GrantReason.GRANT_REASON_Unk3100_CKJJFGCFGEE;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<GrantReason> internalGetValueMap() {
                return GrantReason.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == GrantReason.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrialAvatarGrantRecord.getDescriptor().getEnumTypes().get(0);
            }
            
            public static GrantReason valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return GrantReason.UNRECOGNIZED;
                }
                return GrantReason.VALUES[desc.getIndex()];
            }
            
            private GrantReason(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ GrantReason[] value() {
                return new GrantReason[] { GrantReason.GRANT_REASON_INVALID, GrantReason.GRANT_REASON_BY_QUEST, GrantReason.GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY, GrantReason.GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE, GrantReason.GRANT_REASON_BY_MIST_TRIAL_ACTIVITY, GrantReason.GRANT_REASON_BY_SUMO_ACTIVITY, GrantReason.GRANT_REASON_Unk2700_ELPMDIEIOHP, GrantReason.GRANT_REASON_Unk2700_FALPDBLGHJB, GrantReason.GRANT_REASON_Unk2700_GAMADMGGMBC, GrantReason.GRANT_REASON_Unk2800_FIIDJHAKMOI, GrantReason.GRANT_REASON_Unk3000_ANPCNHCADHG, GrantReason.GRANT_REASON_Unk3000_AJIFFOLFKLO, GrantReason.GRANT_REASON_Unk3100_CKJJFGCFGEE, GrantReason.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<GrantReason>() {
                    @Override
                    public GrantReason findValueByNumber(final int number) {
                        return GrantReason.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrialAvatarGrantRecordOrBuilder
        {
            private int grantReason_;
            private int fromParentQuestId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(TrialAvatarGrantRecord.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TrialAvatarGrantRecord.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.grantReason_ = 0;
                this.fromParentQuestId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
            }
            
            @Override
            public TrialAvatarGrantRecord getDefaultInstanceForType() {
                return TrialAvatarGrantRecord.getDefaultInstance();
            }
            
            @Override
            public TrialAvatarGrantRecord build() {
                final TrialAvatarGrantRecord result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TrialAvatarGrantRecord buildPartial() {
                final TrialAvatarGrantRecord result = new TrialAvatarGrantRecord(this);
                result.grantReason_ = this.grantReason_;
                result.fromParentQuestId_ = this.fromParentQuestId_;
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
                if (other instanceof TrialAvatarGrantRecord) {
                    return this.mergeFrom((TrialAvatarGrantRecord)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TrialAvatarGrantRecord other) {
                if (other == TrialAvatarGrantRecord.getDefaultInstance()) {
                    return this;
                }
                if (other.getGrantReason() != 0) {
                    this.setGrantReason(other.getGrantReason());
                }
                if (other.getFromParentQuestId() != 0) {
                    this.setFromParentQuestId(other.getFromParentQuestId());
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
                TrialAvatarGrantRecord parsedMessage = null;
                try {
                    parsedMessage = TrialAvatarGrantRecord.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TrialAvatarGrantRecord)e.getUnfinishedMessage();
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
            public int getGrantReason() {
                return this.grantReason_;
            }
            
            public Builder setGrantReason(final int value) {
                this.grantReason_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGrantReason() {
                this.grantReason_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFromParentQuestId() {
                return this.fromParentQuestId_;
            }
            
            public Builder setFromParentQuestId(final int value) {
                this.fromParentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFromParentQuestId() {
                this.fromParentQuestId_ = 0;
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
    
    public interface TrialAvatarGrantRecordOrBuilder extends MessageOrBuilder
    {
        int getGrantReason();
        
        int getFromParentQuestId();
    }
}

// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk3000CCCOFNABDMB
{
    private static final Descriptors.Descriptor internal_static_Unk3000_CCCOFNABDMB_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk3000_CCCOFNABDMB_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk3000CCCOFNABDMB() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk3000CCCOFNABDMB.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk3000_CCCOFNABDMB.proto\"f\n\u0013Unk3000_CCCOFNABDMB\u0012\u0010\n\bstage_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nscore_list\u0018\u0004 \u0003(\r\u0012\u0015\n\ris_new_record\u0018\r \u0001(\b\u0012\u0012\n\ndifficulty\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk3000CCCOFNABDMB.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk3000_CCCOFNABDMB_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk3000_CCCOFNABDMB_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_descriptor, new String[] { "StageId", "ScoreList", "IsNewRecord", "Difficulty" });
    }
    
    public static final class Unk3000_CCCOFNABDMB extends GeneratedMessageV3 implements Unk3000_CCCOFNABDMBOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STAGE_ID_FIELD_NUMBER = 1;
        private int stageId_;
        public static final int SCORE_LIST_FIELD_NUMBER = 4;
        private Internal.IntList scoreList_;
        private int scoreListMemoizedSerializedSize;
        public static final int IS_NEW_RECORD_FIELD_NUMBER = 13;
        private boolean isNewRecord_;
        public static final int DIFFICULTY_FIELD_NUMBER = 5;
        private int difficulty_;
        private byte memoizedIsInitialized;
        private static final Unk3000_CCCOFNABDMB DEFAULT_INSTANCE;
        private static final Parser<Unk3000_CCCOFNABDMB> PARSER;
        
        private Unk3000_CCCOFNABDMB(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.scoreListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private Unk3000_CCCOFNABDMB() {
            this.scoreListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.scoreList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk3000_CCCOFNABDMB();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk3000_CCCOFNABDMB(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.stageId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.scoreList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.scoreList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.scoreList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.scoreList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            this.difficulty_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isNewRecord_ = input.readBool();
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
                    this.scoreList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_CCCOFNABDMB.class, Builder.class);
        }
        
        @Override
        public int getStageId() {
            return this.stageId_;
        }
        
        @Override
        public List<Integer> getScoreListList() {
            return this.scoreList_;
        }
        
        @Override
        public int getScoreListCount() {
            return this.scoreList_.size();
        }
        
        @Override
        public int getScoreList(final int index) {
            return this.scoreList_.getInt(index);
        }
        
        @Override
        public boolean getIsNewRecord() {
            return this.isNewRecord_;
        }
        
        @Override
        public int getDifficulty() {
            return this.difficulty_;
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
            this.getSerializedSize();
            if (this.stageId_ != 0) {
                output.writeUInt32(1, this.stageId_);
            }
            if (this.getScoreListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.scoreListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.scoreList_.size(); ++i) {
                output.writeUInt32NoTag(this.scoreList_.getInt(i));
            }
            if (this.difficulty_ != 0) {
                output.writeUInt32(5, this.difficulty_);
            }
            if (this.isNewRecord_) {
                output.writeBool(13, this.isNewRecord_);
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
            if (this.stageId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.stageId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.scoreList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.scoreList_.getInt(i));
            }
            size += dataSize;
            if (!this.getScoreListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.scoreListMemoizedSerializedSize = dataSize;
            if (this.difficulty_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.difficulty_);
            }
            if (this.isNewRecord_) {
                size += CodedOutputStream.computeBoolSize(13, this.isNewRecord_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk3000_CCCOFNABDMB)) {
                return super.equals(obj);
            }
            final Unk3000_CCCOFNABDMB other = (Unk3000_CCCOFNABDMB)obj;
            return this.getStageId() == other.getStageId() && this.getScoreListList().equals(other.getScoreListList()) && this.getIsNewRecord() == other.getIsNewRecord() && this.getDifficulty() == other.getDifficulty() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getStageId();
            if (this.getScoreListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getScoreListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsNewRecord());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getDifficulty();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_CCCOFNABDMB.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_CCCOFNABDMB.PARSER, input);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_CCCOFNABDMB.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_CCCOFNABDMB parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_CCCOFNABDMB.PARSER, input);
        }
        
        public static Unk3000_CCCOFNABDMB parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_CCCOFNABDMB.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_CCCOFNABDMB.PARSER, input);
        }
        
        public static Unk3000_CCCOFNABDMB parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_CCCOFNABDMB.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk3000_CCCOFNABDMB.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk3000_CCCOFNABDMB prototype) {
            return Unk3000_CCCOFNABDMB.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk3000_CCCOFNABDMB.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk3000_CCCOFNABDMB getDefaultInstance() {
            return Unk3000_CCCOFNABDMB.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk3000_CCCOFNABDMB> parser() {
            return Unk3000_CCCOFNABDMB.PARSER;
        }
        
        @Override
        public Parser<Unk3000_CCCOFNABDMB> getParserForType() {
            return Unk3000_CCCOFNABDMB.PARSER;
        }
        
        @Override
        public Unk3000_CCCOFNABDMB getDefaultInstanceForType() {
            return Unk3000_CCCOFNABDMB.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk3000_CCCOFNABDMB();
            PARSER = new AbstractParser<Unk3000_CCCOFNABDMB>() {
                @Override
                public Unk3000_CCCOFNABDMB parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk3000_CCCOFNABDMB(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk3000_CCCOFNABDMBOrBuilder
        {
            private int bitField0_;
            private int stageId_;
            private Internal.IntList scoreList_;
            private boolean isNewRecord_;
            private int difficulty_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_CCCOFNABDMB.class, Builder.class);
            }
            
            private Builder() {
                this.scoreList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.scoreList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk3000_CCCOFNABDMB.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.stageId_ = 0;
                this.scoreList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.isNewRecord_ = false;
                this.difficulty_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk3000CCCOFNABDMB.internal_static_Unk3000_CCCOFNABDMB_descriptor;
            }
            
            @Override
            public Unk3000_CCCOFNABDMB getDefaultInstanceForType() {
                return Unk3000_CCCOFNABDMB.getDefaultInstance();
            }
            
            @Override
            public Unk3000_CCCOFNABDMB build() {
                final Unk3000_CCCOFNABDMB result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk3000_CCCOFNABDMB buildPartial() {
                final Unk3000_CCCOFNABDMB result = new Unk3000_CCCOFNABDMB(this);
                final int from_bitField0_ = this.bitField0_;
                result.stageId_ = this.stageId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.scoreList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.scoreList_ = this.scoreList_;
                result.isNewRecord_ = this.isNewRecord_;
                result.difficulty_ = this.difficulty_;
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
                if (other instanceof Unk3000_CCCOFNABDMB) {
                    return this.mergeFrom((Unk3000_CCCOFNABDMB)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk3000_CCCOFNABDMB other) {
                if (other == Unk3000_CCCOFNABDMB.getDefaultInstance()) {
                    return this;
                }
                if (other.getStageId() != 0) {
                    this.setStageId(other.getStageId());
                }
                if (!other.scoreList_.isEmpty()) {
                    if (this.scoreList_.isEmpty()) {
                        this.scoreList_ = other.scoreList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureScoreListIsMutable();
                        this.scoreList_.addAll(other.scoreList_);
                    }
                    this.onChanged();
                }
                if (other.getIsNewRecord()) {
                    this.setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getDifficulty() != 0) {
                    this.setDifficulty(other.getDifficulty());
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
                Unk3000_CCCOFNABDMB parsedMessage = null;
                try {
                    parsedMessage = Unk3000_CCCOFNABDMB.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk3000_CCCOFNABDMB)e.getUnfinishedMessage();
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
            public int getStageId() {
                return this.stageId_;
            }
            
            public Builder setStageId(final int value) {
                this.stageId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStageId() {
                this.stageId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureScoreListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.scoreList_ = GeneratedMessageV3.mutableCopy(this.scoreList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getScoreListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.scoreList_) : this.scoreList_;
            }
            
            @Override
            public int getScoreListCount() {
                return this.scoreList_.size();
            }
            
            @Override
            public int getScoreList(final int index) {
                return this.scoreList_.getInt(index);
            }
            
            public Builder setScoreList(final int index, final int value) {
                this.ensureScoreListIsMutable();
                this.scoreList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addScoreList(final int value) {
                this.ensureScoreListIsMutable();
                this.scoreList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllScoreList(final Iterable<? extends Integer> values) {
                this.ensureScoreListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.scoreList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearScoreList() {
                this.scoreList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsNewRecord() {
                return this.isNewRecord_;
            }
            
            public Builder setIsNewRecord(final boolean value) {
                this.isNewRecord_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsNewRecord() {
                this.isNewRecord_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDifficulty() {
                return this.difficulty_;
            }
            
            public Builder setDifficulty(final int value) {
                this.difficulty_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDifficulty() {
                this.difficulty_ = 0;
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
    
    public interface Unk3000_CCCOFNABDMBOrBuilder extends MessageOrBuilder
    {
        int getStageId();
        
        List<Integer> getScoreListList();
        
        int getScoreListCount();
        
        int getScoreList(final int p0);
        
        boolean getIsNewRecord();
        
        int getDifficulty();
    }
}
